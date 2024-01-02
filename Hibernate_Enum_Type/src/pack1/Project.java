package pack1;
import javax.persistence.*;
@Entity
@Table(name="project")

public class Project 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="project_name")
	private String ProjectName;
	@Enumerated(EnumType.STRING)
	@Column(name="project_status")
	private ProjectStatus projectStatus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProjectName() {
		return ProjectName;
	}
	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}
	public ProjectStatus getProjectStatus() {
		return projectStatus;
	}
	public void setProjectStatus(ProjectStatus projectStatus) {
		this.projectStatus = projectStatus;
	}
	

}
