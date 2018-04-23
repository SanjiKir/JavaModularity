package com.updated.module;

public class UpdatedModule {
    private static final String MODULE_NAME = UpdatedModule.class.getModule().getName();
    private static final String PACKAGE_NAME = UpdatedModule.class.getPackageName();

    public static void main(String[] args) {
        Module module = UpdatedModule.class.getModule();
        Module javaBase = int.class.getModule();

        System.out.println(module.isOpen(PACKAGE_NAME, javaBase) ?
                PACKAGE_NAME + " is opened to java.base" :
                PACKAGE_NAME + " not opened to java.base");
        System.out.println(module.isExported(PACKAGE_NAME, javaBase)
                ? PACKAGE_NAME + " is exported to java.base by " + MODULE_NAME :
                  PACKAGE_NAME + " is not exported to java.base by " + MODULE_NAME);

        module.addExports(PACKAGE_NAME, javaBase);
        module.addOpens(PACKAGE_NAME, javaBase);

        System.out.println(module.isOpen(PACKAGE_NAME, javaBase) ?
                PACKAGE_NAME + " is opened to java.base" :
                PACKAGE_NAME + " is not opened to java.base");
        System.out.println(module.isExported(PACKAGE_NAME, javaBase)
                ? PACKAGE_NAME + "is exported to java.base by " + MODULE_NAME :
                  PACKAGE_NAME + "is not exported to java.base by " + MODULE_NAME);
    }

}
