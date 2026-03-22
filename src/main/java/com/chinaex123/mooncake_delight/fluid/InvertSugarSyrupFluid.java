package com.chinaex123.mooncake_delight.fluid;

import com.chinaex123.mooncake_delight.block.ModBlocks;
import com.chinaex123.mooncake_delight.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;

// 流体 - 流动特性
public abstract class InvertSugarSyrupFluid extends BaseFlowingFluid {

    public static final BaseFlowingFluid.Properties PROPERTIES;

    private InvertSugarSyrupFluid() {
        super(PROPERTIES);
    }

    static {
        // 转换糖浆
        PROPERTIES = (new BaseFlowingFluid.Properties(ModFluidTypes.INVERT_SUGAR_SYRUP_TYPE, ModFluids.INVERT_SUGAR_SYRUP, ModFluids.FLOWING_INVERT_SUGAR_SYRUP))
                .explosionResistance(100.0F) // 抗爆性
                .slopeFindDistance(4) // 流动查找距离
                .levelDecreasePerBlock(1) // 液面下降等级
                .tickRate(25) // 流动速度
                .bucket(ModItems.INVERT_SUGAR_SYRUP_BUCKET)
                .block(ModBlocks.INVERT_SUGAR_SYRUP_BLOCK);
    }

    @Override
    public boolean canConvertToSource(FluidState state, Level level, BlockPos pos) {
        return false;
    }

    public static class Source extends InvertSugarSyrupFluid {
        public int getAmount(FluidState state) {
            return 8;
        }

        public boolean isSource(FluidState state) {
            return true;
        }
    }

    public static class Flowing extends InvertSugarSyrupFluid {
        protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
            super.createFluidStateDefinition(builder);
            builder.add(LEVEL);
        }

        public int getAmount(FluidState state) {
            return state.getValue(LEVEL);
        }

        public boolean isSource(FluidState state) {
            return false;
        }
    }
}
