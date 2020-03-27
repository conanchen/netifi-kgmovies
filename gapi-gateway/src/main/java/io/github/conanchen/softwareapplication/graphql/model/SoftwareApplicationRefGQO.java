package io.github.conanchen.softwareapplication.graphql.model;

public class SoftwareApplicationRefGQO {

    private String id;
    private String identifier;
    private String name;
    private String alternateName;
    private String description;
    private String applicationSuite;
    private String downloadUrl;
    private String featureList;
    private String installUrl;
    private String releaseNotes;
    private String screenshot;
    private String softwareVersion;

    public SoftwareApplicationRefGQO() {
    }

    public SoftwareApplicationRefGQO(String id, String identifier, String name, String alternateName, String description, String applicationSuite, String downloadUrl, String featureList, String installUrl, String releaseNotes, String screenshot, String softwareVersion) {
        this.id = id;
        this.identifier = identifier;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.applicationSuite = applicationSuite;
        this.downloadUrl = downloadUrl;
        this.featureList = featureList;
        this.installUrl = installUrl;
        this.releaseNotes = releaseNotes;
        this.screenshot = screenshot;
        this.softwareVersion = softwareVersion;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getIdentifier() {
        return identifier;
    }
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAlternateName() {
        return alternateName;
    }
    public void setAlternateName(String alternateName) {
        this.alternateName = alternateName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getApplicationSuite() {
        return applicationSuite;
    }
    public void setApplicationSuite(String applicationSuite) {
        this.applicationSuite = applicationSuite;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getFeatureList() {
        return featureList;
    }
    public void setFeatureList(String featureList) {
        this.featureList = featureList;
    }

    public String getInstallUrl() {
        return installUrl;
    }
    public void setInstallUrl(String installUrl) {
        this.installUrl = installUrl;
    }

    public String getReleaseNotes() {
        return releaseNotes;
    }
    public void setReleaseNotes(String releaseNotes) {
        this.releaseNotes = releaseNotes;
    }

    public String getScreenshot() {
        return screenshot;
    }
    public void setScreenshot(String screenshot) {
        this.screenshot = screenshot;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }
    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

}