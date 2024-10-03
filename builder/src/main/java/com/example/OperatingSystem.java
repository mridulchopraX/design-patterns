package com.example;

import java.util.List;

public class OperatingSystem {
    String name; // required
    int version;
    String buildNumber;
    String architecture;
    String kernelType;
    Boolean isTerminalBased;
    Boolean isGraphical;
    Boolean isServer;
    List<String> features;

    private OperatingSystem(OperatingSystemBuilder builder) {
        this.name = builder.name;
        this.version = builder.version;
        this.buildNumber = builder.buildNumber;
        this.architecture = builder.architecture;
        this.kernelType = builder.kernelType;
        this.isTerminalBased = builder.isTerminalBased;
        this.isGraphical = builder.isGraphical;
        this.isServer = builder.isServer;
        this.features = builder.features;
    }

    private interface OperatingSystemBuilderInterface {
        OperatingSystemBuilderInterface version(int version);
        OperatingSystemBuilderInterface buildNumber(String buildNumber);
        OperatingSystemBuilderInterface architecture(String architecture);
        OperatingSystemBuilderInterface kernelType(String kernelType);
        OperatingSystemBuilderInterface isTerminalBased(Boolean isTerminalBased);
        OperatingSystemBuilderInterface isGraphical(Boolean isGraphical);
        OperatingSystemBuilderInterface isServer(Boolean isServer);
        OperatingSystemBuilderInterface features(List<String> features);
        OperatingSystem build();
    }

    public static class OperatingSystemBuilder implements OperatingSystemBuilderInterface {
        String name; // required
        int version;
        String buildNumber;
        String architecture;
        String kernelType;
        Boolean isTerminalBased;
        Boolean isGraphical;
        Boolean isServer;
        List<String> features;

        // required fields go in the constructor
        public OperatingSystemBuilder(String name) {
            this.name = name;
        }

        public OperatingSystemBuilder version(int version) {
            this.version = version;
            return this;
        }

        public OperatingSystemBuilder buildNumber(String buildNumber) {
            this.buildNumber = buildNumber;
            return this;
        }

        public OperatingSystemBuilder architecture(String architecture) {
            this.architecture = architecture;
            return this;
        }

        public OperatingSystemBuilder kernelType(String kernelType) {
            this.kernelType = kernelType;
            return this;
        }

        public OperatingSystemBuilder isTerminalBased(Boolean isTerminalBased) {
            this.isTerminalBased = isTerminalBased;
            return this;
        }

        public OperatingSystemBuilder isGraphical(Boolean isGraphical) {
            this.isGraphical = isGraphical;
            return this;
        }

        public OperatingSystemBuilder isServer(Boolean isServer) {
            this.isServer = isServer;
            return this;
        }

        public OperatingSystemBuilder features(List<String> features) {
            this.features = features;
            return this;
        }

        public OperatingSystem build() {
            return new OperatingSystem(this);
        }
    }
}
