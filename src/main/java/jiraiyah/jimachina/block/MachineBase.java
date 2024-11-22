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

/**
 * The {@code MachineBase} class serves as a foundational class for creating machine blocks
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
 * public class AdvancedMachineBlock extends MachineBase {
 *     // Custom implementation details
 * }
 * }</pre>
 * </p>
 */
@SuppressWarnings("unused")
public abstract class MachineBase extends AbstractActivatableMachineBlock
{
    /**
     * Constructs a new instance of `MachineBase` with the specified settings.
     *
     * <p>This constructor initializes the `MachineBase` block using the provided
     * `AbstractBlock.Settings`. The settings parameter allows customization of
     * various block properties such as hardness, resistance, and other block
     * behaviors specific to the Minecraft environment.</p>
     *
     * @param settings the settings used to configure the block properties.
     *                 This parameter must not be null and should be configured
     *                 according to the desired block characteristics.
     */
    public MachineBase(AbstractBlock.Settings settings)
    {
        super(settings);
    }
}