# (sudo yum install docker -y &#40;once&#41;)

# (chmod 400 cicd-demo-keypair.pem &#40;once&#41;)

# (ssh -i cicd-demo-keypair.pem ec2-user@54.227.87.173 &#40;connect to EC2 instance&#41;)

# (sudo yum install docker -y &#40;once&#41;)

# ()
# (docker --version)

# (sudo systemctl start docker)

# (sudo systemctl enable docker)

# (Created symlink /etc/systemd/system/multi-user.target.wants/docker.service → /usr/lib/systemd/system/docker.service.)

# ()
# (sudo usermod -aG docker ec2-user &#40;adding ec2-user to the docker security group&#41;)

# ()
# (docker pull ksaurabh25/spring-boot-cicd-demo:latest)

# (latest: Pulling from ksaurabh25/spring-boot-cicd-demo)

# (no matching manifest for linux/amd64 in the manifest list entries)

# ()
# (    Your MacBook is almost certainly Apple Silicon &#40;M1/M2/M3&#41;, so docker build produced an arm64 image by default. The EC2 instance is  x86_64 &#40;amd64&#41;, and your image has no amd64 variant, so the pull fails.)

# (    Fix: rebuild for amd64 and push)

# (docker buildx build --platform linux/amd64 \ -t ksaurabh25/spring-boot-cicd-demo:latest \ --push .)

# ()
# (docker pull ksaurabh25/spring-boot-cicd-demo:latest &#40;success now&#41;)

# ()
# (docker run -p 8080:8080 -d ksaurabh25/spring-boot-cicd-demo)

# (&#40;For this, in EC2 instance add inbound rules to consume traffic for port 8080&#41;)

# (&#40;Go to public url of EC2 and hit http://public_ip:8080&#41;)

# ()

# (echo "# spring-boot-ci-demol > README.md)

# (git init)

# (git add README.md)

# (git commit -m "first commit")

# (git branch -M main)

# (git remote add origin https://github.com/kumarsar/spring-boot-cicd-demo.git)

# (git push -u origin main)