package io.github.githubv4.graphql.api;

import java.util.*;
import io.github.githubv4.graphql.model.*;

public interface Query {

    CodeOfConductGQO codeOfConduct(String key) throws Exception;

    Collection<CodeOfConductGQO> codesOfConduct() throws Exception;

    EnterpriseGQO enterprise(String invitationToken, String slug) throws Exception;

    EnterpriseAdministratorInvitationGQO enterpriseAdministratorInvitation(String enterpriseSlug, EnterpriseAdministratorRoleGQO role, String userLogin) throws Exception;

    EnterpriseAdministratorInvitationGQO enterpriseAdministratorInvitationByToken(String invitationToken) throws Exception;

    LicenseGQO license(String key) throws Exception;

    @javax.validation.constraints.NotNull
    Collection<LicenseGQO> licenses() throws Exception;

    @javax.validation.constraints.NotNull
    Collection<MarketplaceCategoryGQO> marketplaceCategories(Boolean excludeEmpty, Boolean excludeSubcategories, Collection<String> includeCategories) throws Exception;

    MarketplaceCategoryGQO marketplaceCategory(String slug, Boolean useTopicAliases) throws Exception;

    MarketplaceListingGQO marketplaceListing(String slug) throws Exception;

    @javax.validation.constraints.NotNull
    MarketplaceListingConnectionGQO marketplaceListings(String adminId, String after, Boolean allStates, String before, String categorySlug, Integer first, Integer last, String organizationId, Boolean primaryCategoryOnly, Collection<String> slugs, Boolean useTopicAliases, Boolean viewerCanAdmin, Boolean withFreeTrialsOnly) throws Exception;

    @javax.validation.constraints.NotNull
    GitHubMetadataGQO meta() throws Exception;

    NodeGQO node(String id) throws Exception;

    @javax.validation.constraints.NotNull
    Collection<NodeGQO> nodes(Collection<String> ids) throws Exception;

    OrganizationGQO organization(String login) throws Exception;

    RateLimitGQO rateLimit(Boolean dryRun) throws Exception;

    RepositoryGQO repository(String name, String owner) throws Exception;

    RepositoryOwnerGQO repositoryOwner(String login) throws Exception;

    UniformResourceLocatableGQO resource(String url) throws Exception;

    @javax.validation.constraints.NotNull
    SearchResultItemConnectionGQO search(String after, String before, Integer first, Integer last, String query, SearchTypeGQO type) throws Exception;

    @javax.validation.constraints.NotNull
    SecurityAdvisoryConnectionGQO securityAdvisories(String after, String before, Integer first, SecurityAdvisoryIdentifierFilterGQO identifier, Integer last, SecurityAdvisoryOrderGQO orderBy, java.util.Date publishedSince, java.util.Date updatedSince) throws Exception;

    SecurityAdvisoryGQO securityAdvisory(String ghsaId) throws Exception;

    @javax.validation.constraints.NotNull
    SecurityVulnerabilityConnectionGQO securityVulnerabilities(String after, String before, SecurityAdvisoryEcosystemGQO ecosystem, Integer first, Integer last, SecurityVulnerabilityOrderGQO orderBy, String Package, Collection<SecurityAdvisorySeverityGQO> severities) throws Exception;

    SponsorsListingGQO sponsorsListing(String slug) throws Exception;

    TopicGQO topic(String name) throws Exception;

    UserGQO user(String login) throws Exception;

    @javax.validation.constraints.NotNull
    UserGQO viewer() throws Exception;

}