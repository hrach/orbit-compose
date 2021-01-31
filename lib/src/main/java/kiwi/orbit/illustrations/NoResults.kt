package kiwi.orbit.illustrations

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import kiwi.orbit.R

@get:Composable
public val Illustrations.NoResults: ImageBitmap
	get() {
		if (illustration != null) return illustration!!
		illustration = imageResource(id = R.drawable.il_no_results)
		return illustration!!
	}

private var illustration: ImageBitmap? = null
