// Generated from graphql_java_gen gem  with template Input.java.erb

package io.github.kgis.graphql;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Tuery;
import com.shopify.graphql.support.Utils;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.math.BigDecimal;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SoftwareApplicationPatch implements Serializable {
    private Input<List<NamespaceRef>> namespaces = Input.undefined();

    private Input<String> identifier = Input.undefined();

    private Input<String> name = Input.undefined();

    private Input<String> alternateName = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<String> applicationSuite = Input.undefined();

    private Input<String> downloadUrl = Input.undefined();

    private Input<String> featureList = Input.undefined();

    private Input<String> installUrl = Input.undefined();

    private Input<String> releaseNotes = Input.undefined();

    private Input<String> screenshot = Input.undefined();

    private Input<String> softwareVersion = Input.undefined();

    public List<NamespaceRef> getNamespaces() {
        return namespaces.getValue();
    }

    public Input<List<NamespaceRef>> getNamespacesInput() {
        return namespaces;
    }

    public SoftwareApplicationPatch setNamespaces(List<NamespaceRef> namespaces) {
        this.namespaces = Input.optional(namespaces);
        return this;
    }

    public SoftwareApplicationPatch setNamespacesInput(Input<List<NamespaceRef>> namespaces) {
        if (namespaces == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.namespaces = namespaces;
        return this;
    }

    public String getIdentifier() {
        return identifier.getValue();
    }

    public Input<String> getIdentifierInput() {
        return identifier;
    }

    public SoftwareApplicationPatch setIdentifier(String identifier) {
        this.identifier = Input.optional(identifier);
        return this;
    }

    public SoftwareApplicationPatch setIdentifierInput(Input<String> identifier) {
        if (identifier == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.identifier = identifier;
        return this;
    }

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public SoftwareApplicationPatch setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public SoftwareApplicationPatch setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public String getAlternateName() {
        return alternateName.getValue();
    }

    public Input<String> getAlternateNameInput() {
        return alternateName;
    }

    public SoftwareApplicationPatch setAlternateName(String alternateName) {
        this.alternateName = Input.optional(alternateName);
        return this;
    }

    public SoftwareApplicationPatch setAlternateNameInput(Input<String> alternateName) {
        if (alternateName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.alternateName = alternateName;
        return this;
    }

    public String getDescription() {
        return description.getValue();
    }

    public Input<String> getDescriptionInput() {
        return description;
    }

    public SoftwareApplicationPatch setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public SoftwareApplicationPatch setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public String getApplicationSuite() {
        return applicationSuite.getValue();
    }

    public Input<String> getApplicationSuiteInput() {
        return applicationSuite;
    }

    public SoftwareApplicationPatch setApplicationSuite(String applicationSuite) {
        this.applicationSuite = Input.optional(applicationSuite);
        return this;
    }

    public SoftwareApplicationPatch setApplicationSuiteInput(Input<String> applicationSuite) {
        if (applicationSuite == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.applicationSuite = applicationSuite;
        return this;
    }

    public String getDownloadUrl() {
        return downloadUrl.getValue();
    }

    public Input<String> getDownloadUrlInput() {
        return downloadUrl;
    }

    public SoftwareApplicationPatch setDownloadUrl(String downloadUrl) {
        this.downloadUrl = Input.optional(downloadUrl);
        return this;
    }

    public SoftwareApplicationPatch setDownloadUrlInput(Input<String> downloadUrl) {
        if (downloadUrl == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.downloadUrl = downloadUrl;
        return this;
    }

    public String getFeatureList() {
        return featureList.getValue();
    }

    public Input<String> getFeatureListInput() {
        return featureList;
    }

    public SoftwareApplicationPatch setFeatureList(String featureList) {
        this.featureList = Input.optional(featureList);
        return this;
    }

    public SoftwareApplicationPatch setFeatureListInput(Input<String> featureList) {
        if (featureList == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.featureList = featureList;
        return this;
    }

    public String getInstallUrl() {
        return installUrl.getValue();
    }

    public Input<String> getInstallUrlInput() {
        return installUrl;
    }

    public SoftwareApplicationPatch setInstallUrl(String installUrl) {
        this.installUrl = Input.optional(installUrl);
        return this;
    }

    public SoftwareApplicationPatch setInstallUrlInput(Input<String> installUrl) {
        if (installUrl == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.installUrl = installUrl;
        return this;
    }

    public String getReleaseNotes() {
        return releaseNotes.getValue();
    }

    public Input<String> getReleaseNotesInput() {
        return releaseNotes;
    }

    public SoftwareApplicationPatch setReleaseNotes(String releaseNotes) {
        this.releaseNotes = Input.optional(releaseNotes);
        return this;
    }

    public SoftwareApplicationPatch setReleaseNotesInput(Input<String> releaseNotes) {
        if (releaseNotes == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.releaseNotes = releaseNotes;
        return this;
    }

    public String getScreenshot() {
        return screenshot.getValue();
    }

    public Input<String> getScreenshotInput() {
        return screenshot;
    }

    public SoftwareApplicationPatch setScreenshot(String screenshot) {
        this.screenshot = Input.optional(screenshot);
        return this;
    }

    public SoftwareApplicationPatch setScreenshotInput(Input<String> screenshot) {
        if (screenshot == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.screenshot = screenshot;
        return this;
    }

    public String getSoftwareVersion() {
        return softwareVersion.getValue();
    }

    public Input<String> getSoftwareVersionInput() {
        return softwareVersion;
    }

    public SoftwareApplicationPatch setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = Input.optional(softwareVersion);
        return this;
    }

    public SoftwareApplicationPatch setSoftwareVersionInput(Input<String> softwareVersion) {
        if (softwareVersion == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.softwareVersion = softwareVersion;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.namespaces.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("namespaces:");
            if (namespaces.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (NamespaceRef item1 : namespaces.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.identifier.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("identifier:");
            if (identifier.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, identifier.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, name.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.alternateName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("alternateName:");
            if (alternateName.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, alternateName.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.description.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("description:");
            if (description.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, description.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.applicationSuite.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("applicationSuite:");
            if (applicationSuite.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, applicationSuite.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.downloadUrl.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("downloadUrl:");
            if (downloadUrl.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, downloadUrl.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.featureList.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("featureList:");
            if (featureList.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, featureList.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.installUrl.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("installUrl:");
            if (installUrl.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, installUrl.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.releaseNotes.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("releaseNotes:");
            if (releaseNotes.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, releaseNotes.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.screenshot.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("screenshot:");
            if (screenshot.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, screenshot.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.softwareVersion.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("softwareVersion:");
            if (softwareVersion.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, softwareVersion.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
