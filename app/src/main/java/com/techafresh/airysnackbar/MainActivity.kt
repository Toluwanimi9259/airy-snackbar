package com.techafresh.airysnackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.akndmr.library.AirySnackbar
import com.akndmr.library.AirySnackbarSource
import com.akndmr.library.AnimationAttribute
import com.akndmr.library.GravityAttribute
import com.akndmr.library.IconAttribute
import com.akndmr.library.RadiusAttribute
import com.akndmr.library.SizeAttribute
import com.akndmr.library.SizeUnit
import com.akndmr.library.TextAttribute
import com.akndmr.library.Type
import com.techafresh.airysnackbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCustom.setOnClickListener {
            AirySnackbar.make(
                source = AirySnackbarSource.ActivitySource(activity = this@MainActivity),
                type = Type.Custom(R.color.teal_700),
                attributes =
                listOf(
                    TextAttribute.Text(text = "Custom color bg AirySnackbar"),
                    TextAttribute.TextColor(textColor = R.color.black),
                    IconAttribute.Icon(iconRes = R.drawable.baseline_info_24),
                    IconAttribute.IconColor(iconTint = R.color.teal_200),
                    SizeAttribute.Margin(left = 24, right = 24, unit = SizeUnit.DP),
                    SizeAttribute.Padding(top = 12, bottom = 12, unit = SizeUnit.DP),
                    RadiusAttribute.Radius(radius = 8f),
                    GravityAttribute.Top,
                    AnimationAttribute.FadeInOut
                )
            ).show()
        }
        binding.buttonDefault.setOnClickListener {
            AirySnackbar.make(
                source = AirySnackbarSource.ActivitySource(activity = this@MainActivity),
                type = Type.Default,
                attributes =
                listOf(
                    TextAttribute.Text(text = "Default AirySnackbar with top margin 16dp and no icon"),
                    IconAttribute.NoIcon,
                    SizeAttribute.Margin(top = 16, unit = SizeUnit.DP),
                    AnimationAttribute.SlideInOut
                )
            ).show()
        }
        binding.buttonError.setOnClickListener {
            AirySnackbar.make(
                source = AirySnackbarSource.ActivitySource(activity = this@MainActivity),
                type = Type.Error,
                attributes =
                listOf(
                    TextAttribute.Text(text = "Error AirySnackbar, default padding and margin"),
                    IconAttribute.Icon(iconRes = R.drawable.ic_error)
                )
            ).show()
        }
        binding.buttonInfo.setOnClickListener {
            AirySnackbar.make(
                source = AirySnackbarSource.ActivitySource(activity = this@MainActivity),
                type = Type.Info,
                attributes =
                listOf(
                    TextAttribute.Text(text = "Info AirySnackbar with top margin 16dp and no icon"),
                    IconAttribute.NoIcon,
                    SizeAttribute.Margin(top = 16, unit = SizeUnit.DP),
                    AnimationAttribute.SlideInOut
                )
            ).show()
        }
        binding.buttonSuccess.setOnClickListener {
            AirySnackbar.make(
                source = AirySnackbarSource.ActivitySource(activity = this@MainActivity),
                type = Type.Success,
                attributes =
                listOf(
                    TextAttribute.Text(text = "Successful AirySnackbar sample some longer text with horizontal padding 16dp and margin 24dp"),
                    SizeAttribute.Padding(
                        left = resources.getDimensionPixelSize(R.dimen.sample_margin_small),
                        right = resources.getDimensionPixelSize(R.dimen.sample_margin_small),
                        unit = SizeUnit.PX
                    ),
                    SizeAttribute.Margin(
                        right = resources.getDimensionPixelSize(R.dimen.sample_margin_medium),
                        left = resources.getDimensionPixelSize(R.dimen.sample_margin_medium),
                        unit = SizeUnit.PX
                    )
                )
            ).show()
        }
        binding.buttonWarning.setOnClickListener {
            AirySnackbar.make(
                source = AirySnackbarSource.ActivitySource(activity = this@MainActivity),
                type = Type.Warning,
                attributes =
                listOf(
                    TextAttribute.Text(text = "Warning AirySnackbar with padding top 48dp and bottom 24dp"),
                    IconAttribute.Icon(iconRes = R.drawable.ic_warning),
                    SizeAttribute.Padding(top = 48, bottom = 24, unit = SizeUnit.DP)
                )
            ).show()
        }
    }
}