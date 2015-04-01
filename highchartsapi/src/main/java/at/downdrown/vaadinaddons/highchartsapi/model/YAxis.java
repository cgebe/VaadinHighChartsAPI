/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi.model;

public class YAxis {
    private String title;
    private boolean labelsEnabled = true;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isLabelsEnabled() {
        return labelsEnabled;
    }

    public void setLabelsEnabled(boolean labelsEnabled) {
        this.labelsEnabled = labelsEnabled;
    }

    public String getHighChartValue() {
        return ", yAxis: { title: { text: '" + getTitle() + "' }, labels: { enabled: " + isLabelsEnabled() + " } }, ";
    }
}