/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.activiti5.engine.impl.persistence.entity;

import java.util.List;
import java.util.Map;

import org.activiti5.engine.identity.Group;
import org.activiti5.engine.identity.GroupQuery;
import org.activiti5.engine.impl.GroupQueryImpl;
import org.activiti5.engine.impl.Page;

/**
 * @author Joram Barrez
 */
public interface GroupIdentityManager {

  Group createNewGroup(String groupId);

  void insertGroup(Group group);

  void updateGroup(Group updatedGroup);

  void deleteGroup(String groupId);

  GroupQuery createNewGroupQuery();

  List<Group> findGroupByQueryCriteria(GroupQueryImpl query, Page page);

  long findGroupCountByQueryCriteria(GroupQueryImpl query);

  List<Group> findGroupsByUser(String userId);

  List<Group> findGroupsByNativeQuery(Map<String, Object> parameterMap, int firstResult, int maxResults);

  long findGroupCountByNativeQuery(Map<String, Object> parameterMap);
  
  boolean isNewGroup(Group group);

}