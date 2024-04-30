package project3.Enums;

public enum Color {
  RED1("passion"),
  YELLOW1("health"),
  BLUE1("Calm");

  private String meaning;

  //   Enum tyupe constructure
  Color(String meaning) {
    this.meaning = meaning;
  }

  public String getMeaning() {
    return meaning;
  }

  public void setMeaning(String meaning) {
    this.meaning = meaning;
  }

  @Override
  public String toString() {
    return "This color's meaning is : " + meaning;
  }
}
