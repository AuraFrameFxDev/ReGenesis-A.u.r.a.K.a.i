// LEGACY STUB — DO NOT ADD IMPLEMENTATION HERE
//
// This file previously held a root-level OracleDriveServiceImpl that:
//   1. Had a rogue `TODO()` extension property (runtime crash bomb)
//   2. Was never Hilt-bound (no DI module references this class)
//   3. Duplicated functionality from oracledrive.service.OracleDriveServiceImpl
//
// CANONICAL IMPLEMENTATIONS:
//   - Hilt-bound (current):  dev.aurakai.auraframefx.oracledrive.service.OracleDriveServiceImpl
//   - Domain-evolved (future): dev.aurakai.auraframefx.domains.genesis.oracledrive.service.OracleDriveServiceImpl
//
// The OracleDriveService interface in this package (with manageFiles/ping/etc)
// is implemented by the service/ subpackage version via the Hilt binding in di/OracleDriveModule.
//
// Removed during Phase 5.2 Stabilization — March 13, 2026
package dev.aurakai.auraframefx.oracledrive
