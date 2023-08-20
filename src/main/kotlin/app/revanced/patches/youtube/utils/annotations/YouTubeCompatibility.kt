package app.revanced.patches.youtube.utils.annotations

import app.revanced.patcher.annotation.Compatibility
import app.revanced.patcher.annotation.Package

@Compatibility(
    [Package(
        "com.google.android.youtube", arrayOf(
            "18.33.35"
        )
    )]
)
@Target(AnnotationTarget.CLASS)
internal annotation class YouTubeCompatibility

