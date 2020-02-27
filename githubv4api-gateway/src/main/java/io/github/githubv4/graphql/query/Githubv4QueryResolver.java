package io.github.githubv4.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import io.github.githubv4.graphql.api.Query;
import io.github.githubv4.graphql.model.*;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;

// import io.github.acmeshoes.store.service.PdpService;
// import io.github.acmeshoes.store.service.model.PdpData;
// import reactor.core.publisher.Mono;

@Service
public class Githubv4QueryResolver implements Query, GraphQLQueryResolver {


    @Override
    public CodeOfConductGQO codeOfConduct(String key) throws Exception {
        return null;
    }

    @Override
    public Collection<CodeOfConductGQO> codesOfConduct() throws Exception {
        return null;
    }

    @Override
    public EnterpriseGQO enterprise(String invitationToken, String slug) throws Exception {
        return null;
    }

    @Override
    public EnterpriseAdministratorInvitationGQO enterpriseAdministratorInvitation(String enterpriseSlug, EnterpriseAdministratorRoleGQO role, String userLogin) throws Exception {
        return null;
    }

    @Override
    public EnterpriseAdministratorInvitationGQO enterpriseAdministratorInvitationByToken(String invitationToken) throws Exception {
        return null;
    }

    @Override
    public LicenseGQO license(String key) throws Exception {
        return null;
    }

    @Override
    public @NotNull Collection<LicenseGQO> licenses() throws Exception {
        return null;
    }

    @Override
    public @NotNull Collection<MarketplaceCategoryGQO> marketplaceCategories(Boolean excludeEmpty, Boolean excludeSubcategories, Collection<String> includeCategories) throws Exception {
        return null;
    }

    @Override
    public MarketplaceCategoryGQO marketplaceCategory(String slug, Boolean useTopicAliases) throws Exception {
        return null;
    }

    @Override
    public MarketplaceListingGQO marketplaceListing(String slug) throws Exception {
        return null;
    }

    @Override
    public @NotNull MarketplaceListingConnectionGQO marketplaceListings(String adminId, String after, Boolean allStates, String before, String categorySlug, Integer first, Integer last, String organizationId, Boolean primaryCategoryOnly, Collection<String> slugs, Boolean useTopicAliases, Boolean viewerCanAdmin, Boolean withFreeTrialsOnly) throws Exception {
        return null;
    }

    @Override
    public @NotNull GitHubMetadataGQO meta() throws Exception {
        return null;
    }

    @Override
    public NodeGQO node(String id) throws Exception {
        return null;
    }

    @Override
    public @NotNull Collection<NodeGQO> nodes(Collection<String> ids) throws Exception {
        return null;
    }

    @Override
    public OrganizationGQO organization(String login) throws Exception {
        return null;
    }

    @Override
    public RateLimitGQO rateLimit(Boolean dryRun) throws Exception {
        return null;
    }

    @Override
    public RepositoryGQO repository(String name, String owner) throws Exception {
        return null;
    }

    @Override
    public RepositoryOwnerGQO repositoryOwner(String login) throws Exception {
        return null;
    }

    @Override
    public UniformResourceLocatableGQO resource(String url) throws Exception {
        return null;
    }

    @Override
    public @NotNull SearchResultItemConnectionGQO search(String after, String before, Integer first, Integer last, String query, SearchTypeGQO type) throws Exception {
        return null;
    }

    @Override
    public @NotNull SecurityAdvisoryConnectionGQO securityAdvisories(String after, String before, Integer first, SecurityAdvisoryIdentifierFilterGQO identifier, Integer last, SecurityAdvisoryOrderGQO orderBy, Date publishedSince, Date updatedSince) throws Exception {
        return null;
    }

    @Override
    public SecurityAdvisoryGQO securityAdvisory(String ghsaId) throws Exception {
        return null;
    }

    @Override
    public @NotNull SecurityVulnerabilityConnectionGQO securityVulnerabilities(String after, String before, SecurityAdvisoryEcosystemGQO ecosystem, Integer first, Integer last, SecurityVulnerabilityOrderGQO orderBy, String Package, Collection<SecurityAdvisorySeverityGQO> severities) throws Exception {
        return null;
    }

    @Override
    public SponsorsListingGQO sponsorsListing(String slug) throws Exception {
        return null;
    }

    @Override
    public TopicGQO topic(String name) throws Exception {
        return null;
    }

    @Override
    public UserGQO user(String login) throws Exception {
        return null;
    }

    @Override
    public @NotNull UserGQO viewer() throws Exception {
        return null;
    }
}