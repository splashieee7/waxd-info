package com.waxd.info.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Waxd terminal/ops-console theme: same four hex values as every other waxd
// reskin. Replaces the stock unmodified Compose-template scheme (Purple80/
// Pink80/etc., never actually shown since dynamicColor defaulted to true) and
// the dynamicDarkColorScheme/dynamicLightColorScheme calls, applied regardless
// of system light/dark to match the rest of the suite always rendering dark.
private val WaxdBackground = Color(0xFF0A0C0A)
private val WaxdText = Color(0xFFD8F5E0)
private val WaxdPrimary = Color(0xFF2E9E5B)
private val WaxdAccent = Color(0xFF4CFF8B)

private val WaxdColorScheme = darkColorScheme(
    primary = WaxdPrimary,
    onPrimary = WaxdBackground,
    secondary = WaxdAccent,
    onSecondary = WaxdBackground,
    background = WaxdBackground,
    onBackground = WaxdText,
    surface = WaxdBackground,
    onSurface = WaxdText,
)

@Composable
fun InfoTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = WaxdColorScheme,
        typography = Typography,
        content = content
    )
}
