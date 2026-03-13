@file:Suppress("unused")
package dev.aurakai.auraframefx.agent

import android.util.Log

private const val TAG = "BaseAgent"

/**
 * LEGACY STUB — Root-level BaseAgent.
 *
 * The canonical BaseAgent implementation lives at:
 *   dev.aurakai.auraframefx.domains.cascade.ai.base.BaseAgent
 *
 * This stub exists to support legacy agent classes (root CascadeAgent,
 * root AuraAgent) that extend BaseAgent from the `agent` package.
 * New code should import from the domains package directly.
 */
abstract class BaseAgent {

    companion object {
        @Volatile
        var isOrchestratorInitialized: Boolean = false
            set(value) {
                if (field != value) {
                    Log.d(TAG, "isOrchestratorInitialized changed from $field to $value")
                    field = value
                }
            }
    }

    // Other common agent functionalities can be added here
}

// Bridge typealias so imports of dev.aurakai.auraframefx.agent.AgentType resolve
typealias AgentType = dev.aurakai.auraframefx.domains.genesis.models.AgentType

// Note: OrchestratableMessage lives in its own file in this package (OrchestratableMessage.kt)
