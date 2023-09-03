package bean;
import java.io.Serializable;

// 1.クラスをpublic指定, 3. Serializable生成
public class RegisterBean implements Serializable {
  private String name;
  private String age;
  private String[] langs;

  // 2.引数なしのコンストラクターを設定
  public RegisterBean() {}

  // 5. setter / getter を作成する
  public void getName(String name) {
    this.name = name;
  }

  public void getAge(String age) {
    this.name = age;
  }

  public void setLangs(String[] langs) {
    this.langs = langs;
  }

  public String getName() {
    return name;
  }

  public String getAge() {
    return age;
  }

  public String[] getLangs() {
    return langs;
  }

  public String getJpnAge() {
    String jpnAge;
    if(age.equals("child")) {
      jpnAge = "18歳未満";
    } else {
      jpnAge = "18歳以上";
    }
    return jpnAge;
  }
  public String getStrLangs() {
    String strLangs = "";
    for(int i = 0; i < langs.length; i++) {
      strLangs = strLangs + langs[i] + "";
    }
    return strLangs;
  }
}

