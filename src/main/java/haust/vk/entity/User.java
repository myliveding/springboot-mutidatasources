package haust.vk.entity;

public class User {

    /**
     * 城市编号
     */
    private Integer id;

    /**
     * 城市名称
     */
    private String userName;


    private City city;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
