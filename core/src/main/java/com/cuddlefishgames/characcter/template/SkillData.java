package com.cuddlefishgames.characcter.template;

import java.util.Set;

public record SkillData(
        String name,
        Set<String> tags,
        String description
) {}
