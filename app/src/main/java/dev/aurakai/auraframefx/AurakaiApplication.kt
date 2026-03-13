package dev.aurakai.auraframefx

import android.app.Application
import com.highcapable.yukihookapi.YukiHookAPI
import dev.aurakai.auraframefx.domains.genesis.config.FeatureToggles
import timber.log.Timber

class AurakaiApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        
        // Initialize Timber for robust logging
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        
        Timber.i("AurakaiApplication: Application started.")

        if (FeatureToggles.XPOSED_ENABLED) {
            // Initialize YukiHookAPI for Kai's Shield / Xposed functionality
            YukiHookAPI.setup {
                debugLog {
                    tag = "AurakaiHook"
                    isEnable = BuildConfig.DEBUG
                }
            }
            checkHookEnvironment()
        }
    }

    private fun checkHookEnvironment() {
        try {
            // This check is a common way to detect if an Xposed/LSPosed environment is active
            // by attempting to access a specific XposedBridge method.
            Class.forName("de.robv.android.xposed.XposedBridge")
            Timber.i("AurakaiApplication: Xposed/LSPosed environment detected!")
        } catch (e: ClassNotFoundException) {
            Timber.i("AurakaiApplication: Xposed/LSPosed environment NOT detected. Running in normal mode.")
        }
    }
}
