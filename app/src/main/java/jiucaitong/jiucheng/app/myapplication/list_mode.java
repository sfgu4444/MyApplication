package jiucaitong.jiucheng.app.myapplication;

/**
 * Created by Administrator on 2018/3/30.
 */

public class list_mode {
    private String name;
    private String status;
    private Integer tag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "list_mode{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", tag=" + tag +
                '}';
    }
}
