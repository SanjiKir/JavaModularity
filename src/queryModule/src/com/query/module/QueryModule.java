package com.query.module;

public class QueryModule {
    private final static String MODULE_NAME = QueryModule.class.getModule().getName();

    public static void main(String[] args) {
        Module queryModule = QueryModule.class.getModule();

        //int simple type always belongs to java base module
        Module javaBase = int.class.getModule();
        System.out.println(queryModule.canRead(javaBase)
                ? MODULE_NAME + " reads java.base" :
                MODULE_NAME + " does not read java.base");
        System.out.println(queryModule.isExported("com.query.module.QueryModule")
                ? "com.query.module.QueryModule is exported by " + MODULE_NAME :
                "com.query.module.QueryModule is not exported by " + MODULE_NAME);
        System.out.println(queryModule.isExported("com.query.module", javaBase)
                ? "com.query.module is exported to java.base by " + MODULE_NAME :
                "com.query.module is not exported to java.base by " + MODULE_NAME);
        System.out.println(queryModule.isOpen("com.query.module")
                ? "com.query.module is open" :
                 "com.query.module is not open");

    }

}
