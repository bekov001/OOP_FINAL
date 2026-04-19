package university;

public class Mark {

    private double attestation1;
    private double attestation2;
    private double finalExam;

    public Mark() {
    }

    public Mark(double attestation1, double attestation2, double finalExam) {
        this.attestation1 = attestation1;
        this.attestation2 = attestation2;
        this.finalExam = finalExam;
    }

    public double calculateTotal() {
        return attestation1 + attestation2 + finalExam;
    }

    public double getAttestation1() {
        return attestation1;
    }

    public void setAttestation1(double attestation1) {
        this.attestation1 = attestation1;
    }

    public double getAttestation2() {
        return attestation2;
    }

    public void setAttestation2(double attestation2) {
        this.attestation2 = attestation2;
    }

    public double getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(double finalExam) {
        this.finalExam = finalExam;
    }
}