package org.example;

import org.commonjava.atlas.maven.ident.util.ArtifactPathInfo;

public class Main {
    public static void main(String[] args) {
        ArtifactPathInfo pathInfo = ArtifactPathInfo.parse("/io/quarkus/quarkus-bom-quarkus-platform-descriptor/3.8.5.redhat-00004/quarkus-bom-quarkus-platform-descriptor-3.8.5.redhat-00004-3.8.5.redhat-00004.json");
        System.out.println("Type: " + pathInfo.getType());
    }
}