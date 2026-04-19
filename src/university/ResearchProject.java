package university;

import java.util.ArrayList;
import java.util.List;

public class ResearchProject {

    private String topic;
    private List<ResearchPaper> publishedPapers;
    private List<Researcher> participants;

    public ResearchProject() {
        this.publishedPapers = new ArrayList<>();
        this.participants = new ArrayList<>();
    }

    public ResearchProject(String topic) {
        this.topic = topic;
        this.publishedPapers = new ArrayList<>();
        this.participants = new ArrayList<>();
    }

    public void addParticipant(Object obj) throws NonResearcherException {
    	if (!(obj instanceof Researcher)) {
            throw new NonResearcherException("User is not a Researcher");
        }
        participants.add((Researcher) obj);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public List<ResearchPaper> getPublishedPapers() {
        return publishedPapers;
    }

    public void setPublishedPapers(List<ResearchPaper> publishedPapers) {
        this.publishedPapers = publishedPapers;
    }

    public List<Researcher> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Researcher> participants) {
        this.participants = participants;
    }
}