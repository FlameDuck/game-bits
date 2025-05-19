package com.cuddlefishgames.characcter.template;

import java.util.List;

public record CharacterData(
        List<LevelData> levels,
        List<AttributeData> attributes,
        List<SkillData> skills
) {
}
