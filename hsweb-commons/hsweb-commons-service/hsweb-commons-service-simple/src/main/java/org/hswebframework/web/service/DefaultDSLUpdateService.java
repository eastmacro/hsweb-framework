/*
 *
 *  * Copyright 2016 http://www.hswebframework.org
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package org.hswebframework.web.service;

import org.hsweb.ezorm.core.dsl.Update;
import org.hswebframework.web.dao.dynamic.UpdateByBeanDao;
import org.hswebframework.web.commons.beans.param.UpdateParamBean;

/**
 * TODO 完成注释
 *
 * @author zhouhao
 */
public interface DefaultDSLUpdateService<PO> extends UpdateService<PO> {

    UpdateByBeanDao getDao();

    default Update<PO, UpdateParamBean<PO>> createUpdate(PO data) {
        return Update.build(getDao()::update, new UpdateParamBean<>(data));
    }
}