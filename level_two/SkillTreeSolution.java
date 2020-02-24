package level_two;

// 스킬트리
public class SkillTreeSolution {

	public static void main(String[] args) {
		int result;
		String paramSkill = "CBD";
		String[] paramskillTrees = { "BACDE", "CBADF", "AECB", "BDA" };

		result = solution(paramSkill, paramskillTrees);
	}

	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;

		for (int st = 0; st < skill_trees.length; st++) {
			String[] skills = skill_trees[st].split("");
			int idx = 0;
			boolean flag = true;

			for (int sk = 0; sk < skills.length; sk++) {
				if (idx < skill.indexOf(skills[sk])) {
					flag = false;
					break;

				} else if (skill.indexOf(skills[sk]) == idx) {
					idx++;

				}
			}

			if (flag) answer++;

			idx = 0;
		}

		return answer;
	}
}