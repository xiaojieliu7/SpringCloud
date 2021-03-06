package com.xiaojie;

import com.xiaojie.data.domain.entity.User;
import com.xiaojie.model.UserInfo;
import com.xiaojie.service.UserService;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceProcessor;

@SpringBootApplication
//@EnableNeo4jRepositories
@EnableDiscoveryClient
@EnableZuulProxy
@EnableHystrix
public class Application  {
    // Used to bootstrap the Neo4j database with demo data
//    @Value("${aws.s3.url}")
//    String datasetUrl;
//
//    public Application() {
//        setBasePackage("com/xiaojie");
//    }

//    @Bean(destroyMethod = "shutdown")
//    public GraphDatabaseService graphDatabaseService() {
//        return new GraphDatabaseFactory().newEmbeddedDatabase("user.db");
//    }

    public static void main(String[] args) {
//        ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
//        RepositoryRestConfiguration restConfiguration = ctx.getBean("config", RepositoryRestConfiguration.class);
//        restConfiguration.exposeIdsFor(UserInfo.class);

        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner() {
//        return strings -> {
//            // Import graph data for users
//            String userImport = String.format("LOAD CSV WITH HEADERS FROM \"%s/users.csv\" AS csvLine\n" +
//                    "MERGE (user:UserInfo:_User { id: csvLine.id, age: toInt(csvLine.age), gender: csvLine.gender, occupation: csvLine.occupation, zipcode: csvLine.zipcode })", datasetUrl);
//
//            neo4jTemplate().query(userImport, null).finish();
//        };
//    }

//    @Bean
//    public ResourceProcessor<Resource<UserInfo>> movieProcessor() {
//        return new ResourceProcessor<Resource<UserInfo>>() {
//            @Override
//            public Resource<UserInfo> process(Resource<UserInfo> resource) {
//
//                resource.add(new Link("/movie/movies", "movies"));
//                return resource;
//            }
//        };
//    }
}
