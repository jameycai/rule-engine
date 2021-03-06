package org.jetlinks.rule.engine.cluster.scope;

import org.jetlinks.core.cluster.ClusterManager;
import org.jetlinks.rule.engine.api.scope.ContextScope;

class ClusterContextScope extends ClusterPersistenceScope implements ContextScope {
    public ClusterContextScope(String id, ClusterManager clusterManager) {
        super(id, clusterManager);
    }
}
