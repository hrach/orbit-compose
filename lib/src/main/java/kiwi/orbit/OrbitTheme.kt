package kiwi.orbit

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import kiwi.orbit.foundation.Colors
import kiwi.orbit.foundation.LocalColors
import kiwi.orbit.foundation.LocalElevationEnabled
import kiwi.orbit.foundation.LocalShapes
import kiwi.orbit.foundation.LocalTypography
import kiwi.orbit.foundation.Shapes
import kiwi.orbit.foundation.Typography

@Composable
public fun OrbitTheme(
    colors: Colors = OrbitTheme.colors,
    typography: Typography = OrbitTheme.typography,
    shapes: Shapes = OrbitTheme.shapes,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalColors provides colors,
        LocalTypography provides typography,
        LocalShapes provides shapes,
    ) {
        MaterialTheme(
            colors = colors.toMaterialColors(),
            typography = typography.toMaterialTypography(),
            shapes = shapes.toMaterialShapes(),
            content = content,
        )
    }
}

public object OrbitTheme {
    public val colors: Colors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    public val typography: Typography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current

    public val shapes: Shapes
        @Composable
        @ReadOnlyComposable
        get() = LocalShapes.current

    public val elevationEnabled: Boolean
        @Composable
        @ReadOnlyComposable
        get() = LocalElevationEnabled.current
}
