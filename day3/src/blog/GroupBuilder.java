package blog;

import java.util.ArrayList;
import java.util.List;
public final class GroupBuilder {
    private static List<Group> groupRepository = new ArrayList<>();
    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName() {
        System.out.printf("Enter group name:");
        while (true) {
            String groupName = null;
            while (groupName == null || groupName.isEmpty()) {
                groupName = BlogMain.enterInput().trim();
            }
            if (!groupRepository.contains(new Group(groupName) )|| groupRepository == null) {
                this.groupName = groupName;
                return;
            }else{
                System.out.printf("Group name already in use!");
            }
        }
    }

    public static List<Group> getGroupRepository() {
        return groupRepository;
    }

    public Group buildGroup (){

        return new Group(this.groupName);
    }
}
