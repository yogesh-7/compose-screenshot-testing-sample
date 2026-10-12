# Contributing

Thanks for helping out! This project welcomes Hacktoberfest contributions.

## Getting started

1. Fork the repo and create a branch from `main`.
2. Make sure you meet the [requirements](README.md#requirements) (alpha AGP, JDK 17+).
3. Run the screenshot tests before you change anything:

   ```bash
   ./gradlew :app:testDebugScreenshotTestDefaultTestSuite
   ```

## Making a change

- **New or changed UI:** re-record the references and commit the updated images in
  `app/src/screenshotTestDefaultDebug/reference/`:

  ```bash
  ./gradlew :app:updateDebugScreenshotTestDefaultTestSuite
  ```

- **New test:** add a `@PreviewTest` + `@Preview` composable under `app/src/screenshotTest/kotlin/`,
  record its reference, and check the image looks right before committing it.
- Keep composables stateless so they render in Layoutlib (see the README's lessons section).
- Run `./gradlew :app:testDebugScreenshotTestDefaultTestSuite` again; it must pass.

## Pull requests

- One topic per PR, with a short description of what changed and why.
- For UI changes, attach the new reference images or a screenshot of the HTML report.
- Spam or low-effort PRs will be labelled `invalid` / `spam` and won't count for Hacktoberfest.
