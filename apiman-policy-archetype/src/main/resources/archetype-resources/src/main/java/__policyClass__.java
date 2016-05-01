package ${package};

import io.apiman.gateway.engine.beans.ApiRequest;
import io.apiman.gateway.engine.beans.ApiResponse;
import io.apiman.gateway.engine.beans.exceptions.ConfigurationParseException;
import io.apiman.gateway.engine.policy.IPolicy;
import io.apiman.gateway.engine.policy.IPolicyChain;
import io.apiman.gateway.engine.policy.IPolicyContext;

/**
 * ${policyName}
 */
public class ${policyClass} implements IPolicy {

    /**
     *  Constructor.
     */
    public ${policyClass}() {
    }

    @Override
    public Object parseConfiguration(String jsonConfiguration) throws ConfigurationParseException {
        return null;
    }

    @Override
    public void apply(ApiRequest request, IPolicyContext context, Object config, IPolicyChain<ApiRequest> chain) {

    }

    @Override
    public void apply(ApiResponse response, IPolicyContext context, Object config, IPolicyChain<ApiResponse> chain) {

    }
}
