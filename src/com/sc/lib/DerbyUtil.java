package com.sc.lib;

import java.io.OutputStream;

/**
 * Class to stop auto gen of derby.log file
 * add -Dderby.stream.error.field=DerbyUtil.DEV_NULL as JVM command line arg in run configurations
 * @author sc
 *
 */
public class DerbyUtil {
    public static final OutputStream DEV_NULL = new OutputStream() {
        public void write(int b) {}
    };
}