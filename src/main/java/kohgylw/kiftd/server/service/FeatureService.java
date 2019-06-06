package kohgylw.kiftd.server.service;

import javax.servlet.http.HttpServletRequest;

public interface FeatureService {
    String getFeatureViewToJson(final HttpServletRequest request);
    String newFeature(final HttpServletRequest request);
    String deleteFeature(final HttpServletRequest request);
    String renameFeature(final HttpServletRequest request);
}
