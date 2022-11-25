package campaignpromotions.models.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@Entity
@Table(name = "campaign")
@ApiModel("Entidad campaña para representar una lista de precios de promociones")
public class Campaigns {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("clave ficticia autoicrementable de tipo Long")
    private Long id;
    private String name;
    private Integer price;
    @Column(name = "ranger_initial")
    private Integer rangerInitial;
    @Column(name = "ranger_final")
    private Integer rangerFinal;

    public Campaigns() {
    }

    public Campaigns(Long id, String name, Integer price, Integer rangerInitial, Integer rangerFinal) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rangerInitial = rangerInitial;
        this.rangerFinal = rangerFinal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRangerInitial() {
        return rangerInitial;
    }

    public void setRangerInitial(Integer rangerInitial) {
        this.rangerInitial = rangerInitial;
    }

    public Integer getRangerFinal() {
        return rangerFinal;
    }

    public void setRangerFinal(Integer rangerFinal) {
        this.rangerFinal = rangerFinal;
    }
}
