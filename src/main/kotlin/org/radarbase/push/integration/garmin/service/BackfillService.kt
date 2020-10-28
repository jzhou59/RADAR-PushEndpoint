package org.radarbase.push.integration.garmin.service

import org.radarbase.gateway.Config
import org.radarbase.push.integration.common.auth.DelegatedAuthValidator.Companion.GARMIN_QUALIFIER
import org.radarbase.push.integration.common.user.UserRepository
import javax.inject.Named
import javax.ws.rs.core.Context

/**
 * The backfill service should be used to collect historic data. This will send requests to garmin's
 * service to create backfill POST requests to our server.
 */
class BackfillService(
    @Context config: Config,
    @Named(GARMIN_QUALIFIER) userRepository: UserRepository
) {

}
