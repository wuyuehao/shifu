/**
 * Copyright [2012-2014] PayPal Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ml.shifu.shifu.container.obj;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * ModelSourceDataConf class
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ModelSourceDataConf extends RawSourceData {

    private String metaColumnNameFile;

    private String categoricalColumnNameFile;

    public String getMetaColumnNameFile() {
        return metaColumnNameFile;
    }

    public void setMetaColumnNameFile(String metaColumnNameFile) {
        this.metaColumnNameFile = metaColumnNameFile;
    }

    public String getCategoricalColumnNameFile() {
        return categoricalColumnNameFile;
    }

    public void setCategoricalColumnNameFile(String categoricalColumnNameFile) {
        this.categoricalColumnNameFile = categoricalColumnNameFile;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public RawSourceData cloneRawSourceData() {
        return super.clone();
    }

}
