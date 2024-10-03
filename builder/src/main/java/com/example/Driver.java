package com.example;

public class Driver {
    public static void main(String[] args) {
        OperatingSystem os = new OperatingSystem.OperatingSystemBuilder("Linux")
                .version(5)
                .buildNumber("5.0.0")
                .architecture("x86_64")
                .kernelType("Monolithic")
                .isTerminalBased(true)
                .isGraphical(false)
                .isServer(true)
                .build();

        System.out.println(os.name);
        System.out.println(os.version);
        System.out.println(os.buildNumber);
        System.out.println(os.architecture);
        System.out.println(os.kernelType);
        System.out.println(os.isTerminalBased);
        System.out.println(os.isGraphical);
        System.out.println(os.isServer);
        System.out.println(os.features);
    }
}
