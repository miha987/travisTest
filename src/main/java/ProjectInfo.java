public class ProjectInfo {
    private String[] clani;
    private String opis;
    private String[] mikrostoritve;
    private String[] github;
    private String[] travis;
    private String[] dockerhub;

    public ProjectInfo() {
        this.clani = new String[] {"Miha Zadravec"};
        this.opis = "To je sam en test da vidm ce dela";
        this.mikrostoritve = new String[] {"https://link1.com/v1/neki"};
        this.travis = new String[] {"https://travis.com/v1/neki"};
        this.github = new String[] {"https://github.com/v1/neki"};
        this.dockerhub = new String[] {"https://docker.com/v1/neki"};
    }

    public String[] getClani() {
        return clani;
    }

    public void setClani(String[] clani) {
        this.clani = clani;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String[] getMikrostoritve() {
        return mikrostoritve;
    }

    public void setMikrostoritve(String[] mikrostoritve) {
        this.mikrostoritve = mikrostoritve;
    }

    public String[] getGithub() {
        return github;
    }

    public void setGithub(String[] github) {
        this.github = github;
    }

    public String[] getTravis() {
        return travis;
    }

    public void setTravis(String[] travis) {
        this.travis = travis;
    }

    public String[] getDockerhub() {
        return dockerhub;
    }

    public void setDockerhub(String[] dockerhub) {
        this.dockerhub = dockerhub;
    }
}
