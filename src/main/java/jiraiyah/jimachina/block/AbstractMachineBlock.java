/***********************************************************************************
 * Copyright (c) 2024 Alireza Khodakarami (Jiraiyah)                               *
 * ------------------------------------------------------------------------------- *
 * MIT License                                                                     *
 * =============================================================================== *
 * Permission is hereby granted, free of charge, to any person obtaining a copy    *
 * of this software and associated documentation files (the "Software"), to deal   *
 * in the Software without restriction, including without limitation the rights    *
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell       *
 * copies of the Software, and to permit persons to whom the Software is           *
 * furnished to do so, subject to the following conditions:                        *
 * ------------------------------------------------------------------------------- *
 * The above copyright notice and this permission notice shall be included in all  *
 * copies or substantial portions of the Software.                                 *
 * ------------------------------------------------------------------------------- *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR      *
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,        *
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE     *
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER          *
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,   *
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE   *
 * SOFTWARE.                                                                       *
 ***********************************************************************************/

package jiraiyah.jimachina.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * The {@code AbstractMachineBlock} class serves as a foundational class for creating machine blocks
 * within the game world. It extends the {@code AbstractActivatableMachineBlock}, inheriting
 * its activation capabilities and providing a base structure for more complex machine
 * implementations.
 * <p>
 * This class is designed to be subclassed by specific machine block types that require
 * additional functionality beyond simple activation. By extending this class, developers
 * can leverage the activation framework and focus on implementing machine-specific
 * behaviors and properties.
 * </p>
 *
 * <p>
 * Example usage:
 * <pre>{@code
 * public class AdvancedMachineBlock extends AbstractMachineBlock {
 *     // Custom implementation details
 * }
 * }</pre>
 * </p>
 */
@SuppressWarnings("unused")
public abstract class AbstractMachineBlock extends AbstractActivatableMachineBlock
{
    /**
     * Constructs a new instance of `AbstractMachineBlock` with the specified settings.
     *
     * <p>This constructor initializes the `AbstractMachineBlock` block using the provided
     * `AbstractBlock.Settings`. The settings parameter allows customization of
     * various block properties such as hardness, resistance, and other block
     * behaviors specific to the Minecraft environment.</p>
     *
     * @param settings the settings used to configure the block properties.
     *                 This parameter must not be null and should be configured
     *                 according to the desired block characteristics.
     */
    public AbstractMachineBlock(AbstractBlock.Settings settings)
    {
        super(settings);
    }

    /**
     * Checks if the block associated with the given {@link BlockState} can provide
     * a redstone comparator output. This is typically used to determine if the block
     * can interact with redstone components by providing a signal strength based on
     * its internal state or contents.
     *
     * @param state the {@link BlockState} representing the current state of the block
     *              in the world. This state may include properties such as the block's
     *              type, orientation, and any other state-specific attributes.
     * @return true if the block can provide a comparator output, indicating that it
     *         can be used in redstone circuits to emit a signal; false otherwise.
     */
    @Override
    protected boolean hasComparatorOutput(BlockState state)
    {
        return true;
    }

    /**
     * Calculates the redstone comparator output signal strength for the block at the specified
     * position in the world. This method is typically used to determine the signal strength
     * emitted by the block based on its current state and any relevant world conditions.
     *
     * @param state the {@link BlockState} representing the current state of the block. This
     *              includes properties such as type, orientation, and any other state-specific
     *              attributes that may affect the comparator output.
     * @param world the {@link World} object representing the world in which the block resides.
     *              This provides access to world-specific data that may influence the block's
     *              behavior, such as time of day or neighboring blocks.
     * @param pos   the {@link BlockPos} indicating the precise location of the block within
     *              the world. This is used to access the block's position-specific data and
     *              interactions with adjacent blocks.
     * @return an integer value representing the comparator output signal strength, typically
     *         ranging from 0 (no signal) to 15 (maximum signal). The exact value is determined
     *         by the block's state and any relevant world conditions.
     */
    @Override
    protected int getComparatorOutput(BlockState state, World world, BlockPos pos)
    {
        return ScreenHandler.calculateComparatorOutput(world.getBlockEntity(pos));
    }
}