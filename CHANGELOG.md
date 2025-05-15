<!-- Keep a Changelog guide -> https://keepachangelog.com -->

# groml-support-plugin Changelog

## [Unreleased]

## [0.0.15] - 2025-05-15

### Added

- ci: optimize release workflow to prevent runner timeouts
- Add `./gradlew clean` before publish to reduce file bloat
- Use `setup-gradle@v4` with `cache-cleanup: on-success`
- Add retry loop to `publishPlugin` step
- Limit release upload to latest distribution file only

[Unreleased]: https://github.com/HarleyGilpin/groml-support-plugin/compare/v0.0.15...HEAD
[0.0.15]: https://github.com/HarleyGilpin/groml-support-plugin/commits/v0.0.15
