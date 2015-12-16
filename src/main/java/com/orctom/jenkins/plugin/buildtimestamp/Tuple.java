package com.orctom.jenkins.plugin.buildtimestamp;

import hudson.Extension;
import hudson.model.AbstractDescribableImpl;
import hudson.model.Descriptor;
import org.kohsuke.stapler.DataBoundConstructor;

/**
 * key value tuple
 * Created by hao on 12/16/15.
 */
public class Tuple extends AbstractDescribableImpl<Tuple> {

	private String key;
	private String value;

	@DataBoundConstructor
	public Tuple(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	@Extension
	public static class DescriptorImpl extends Descriptor<Tuple> {
		public String getDisplayName() { return ""; }
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Tuple tuple = (Tuple) o;

		if (key != null ? !key.equals(tuple.key) : tuple.key != null) return false;
		return !(value != null ? !value.equals(tuple.value) : tuple.value != null);

	}

	@Override
	public int hashCode() {
		int result = key != null ? key.hashCode() : 0;
		result = 31 * result + (value != null ? value.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "[" + key + " -> " + value + "]";
	}
}
