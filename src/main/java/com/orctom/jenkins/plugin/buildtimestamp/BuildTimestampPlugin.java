package com.orctom.jenkins.plugin.buildtimestamp;

import hudson.EnvVars;
import hudson.Extension;
import hudson.Launcher;
import hudson.model.*;
import hudson.model.listeners.RunListener;
import jenkins.model.Jenkins;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.kohsuke.stapler.StaplerRequest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * set build timestamp property to build
 * Created by hao on 12/15/15.
 */
public class BuildTimestampPlugin {

	public static final String PLUGIN_NAME = "Build Timestamp Plugin";

	public static final String DEFAULT_PROPERTY = "BUILD_TIMESTAMP";
	public static final String DEFAULT_PATTERN = "yyyy-MM-dd HH:mm:ss z";

}
