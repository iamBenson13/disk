package kohgylw.kiftd.server.mapper;

import kohgylw.kiftd.server.model.*;

import java.util.*;

/**
 * @author wzy
 * @create 2019-05-27  10:02
 */

public interface FeatureMapper {

   List<Feature> getFeatures();

   Feature getFeaturesById(final String fid);

   int insertNewFeature(final Feature f);

   int deleteById(final String featureId);

   int updateFeatureNameById(final Map<String, String> map);
}
