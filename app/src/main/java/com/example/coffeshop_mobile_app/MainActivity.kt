package com.example.coffeshop_mobile_app

import android.bluetooth.BluetoothClass.Device
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.coffeshop_mobile_app.ui.theme.CoffeShopMobileAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoffeShopMobileAppTheme {
                CoffeShopMobileApp()
            }
        }
    }
}

@Composable
fun CoffeShopMobileApp() {

}

@Preview(showBackground = true, device = Devices.PIXEL)
@Composable
fun CoffeShopMobileAppPreview() {
    CoffeShopMobileAppTheme {
        CoffeShopMobileApp()
    }
}