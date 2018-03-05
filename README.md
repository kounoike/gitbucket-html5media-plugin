# gitbucket-html5media-plugin

This plugin introduce to render Video/Audio/PDF by [GitBucket](https://github.com/gitbucket/gitbucket).

## Screenshot

![20170604-005953 - mediatest do-mo mp4 at master - root mediatest - google chrome](https://cloud.githubusercontent.com/assets/6997928/26755081/359f9822-48c1-11e7-8e49-96d9b8e27a78.png)


## Install

1. Download *.jar from Releases.
2. Deploy it to `GITBUCKET_HOME/plugins`.
3. Restart GitBucket.

## Supported format

- Video
    - .mp4
    - .webm
    - .ogv
- Audio
    - .mp3
    - .aac
    - .ogg
    - .flac
    - .wav
- PDF
    - .pdf

## Tips

Video/Audio/PDF files should be stored with GitLFS.

To enable LFS on GitBucket, you need set base URL in settings. (reffer to [This page](http://gitbucket.github.io/gitbucket-news/gitbucket/2017/01/29/gitbucket-4.9.html)

Client side operations are described in [git-lfs Tutorial](https://github.com/git-lfs/git-lfs/wiki/Tutorial).
