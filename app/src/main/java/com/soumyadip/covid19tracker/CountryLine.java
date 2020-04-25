package com.soumyadip.covid19tracker;

public class CountryLine implements Comparable<CountryLine>  {

    public String countryName, cases, recovered, deaths, newCases, newDeaths;
    public CountryLine(String countryName, String cases, String newCases, String recovered, String deaths, String newDeaths) {
        super();
        this.countryName = countryName;
        this.cases = cases;
        this.recovered = recovered;
        this.deaths = deaths;
        this.newCases = newCases;
        this.newDeaths = newDeaths;
    }
    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCases() {
        return cases;
    }
    public void setCases(String cases) {
        this.cases = cases;
    }

    public String getRecovered() {
        return recovered;
    }
    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getDeaths() {
        return deaths;
    }
    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    public String getNewCases() {
        return newCases;
    }
    public void setNewCases(String newCases) {
        this.newCases = newCases;
    }

    public String getNewDeaths() {
        return newDeaths;
    }
    public void setNewDeaths(String newDeaths) {
        this.newDeaths = newDeaths;
    }

    @Override
    public int compareTo(CountryLine countryLine) {
        return Integer.parseInt(countryLine.getCases().replaceAll(",", ""))
                - Integer.parseInt(this.cases.replaceAll(",", ""));
    }
}
