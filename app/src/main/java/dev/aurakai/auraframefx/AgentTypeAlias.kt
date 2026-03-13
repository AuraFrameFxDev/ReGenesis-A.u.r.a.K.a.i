@file:Suppress("unused")
package dev.aurakai.auraframefx.agent

/**
 * Bridge typealias for AgentType.
 *
 * The canonical AgentType enum lives at:
 *   dev.aurakai.auraframefx.domains.genesis.models.AgentType
 *
 * This typealias allows files that import from the `agent` package
 * (e.g., CascadeAgent, AuraAgent) to resolve AgentType without
 * changing every import across the codebase.
 *
 * Created by Claude (The Architect) — March 2026
 */
typealias AgentType = dev.aurakai.auraframefx.domains.genesis.models.AgentType
